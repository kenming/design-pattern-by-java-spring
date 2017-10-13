package kenming.pattern.creation.abstractfactory;

import java.util.*;
import kenming.pattern.creation.abstractfactory.participant.*;

public class 管理工作單Control
{
    private List<WorkItemDTO> workitemList;     // Act as a in-memory repository
    private ParticipantFactory factory;

    // constructor
    public 管理工作單Control()
    {
        workitemList = new ArrayList<WorkItemDTO>();
    }

    /// <summary>
    /// 設定所使用的參與者工廠
    /// 目前提供的工廠：LDAP / LocalDB
    /// </summary>
    public void SetParticipantFactory(ParticipantFactoryEnum factory_type)
    {
        switch (factory_type)
        { 
            case LDAP :
                factory = new LDAPParticipantFactory();
                break;
            case LocalDB:
                factory = new LocalDBParticipantFactory();
                break;
        }
    }


    /// <summary>
    /// 新增工作單 (WorkItem)
    /// </summary>
    public void AddWorkItem(WorkItemDTO wkdto)
    {
        wkdto.setID(Integer.toString(workitemList.size() + 1));       // Set the WorkItem ID
        workitemList.add(wkdto);    	                            // Add the WorkItem DTO to the List
    }

    /// <summary>
    /// 列出所有工作單項目
    /// </summary>
    /// <returns></returns>
    public List<WorkItemDTO> ListAllWorkItems()
    {
        return this.workitemList;
    }

    /// <summary>
    /// 
    /// </summary>
    /// <param name="WorkItemID">工作單號</param>
    /// <returns></returns>
    public String Process(String WorkItemID)
    {
    	/* C# Query notation.
        WorkItemDTO dto = (WorkItemDTO)workitemList.SingleOrDefault(x => x.ID == WorkItemID);       
        */
        
    	// with_java8_lambda
        Optional<WorkItemDTO> dto = workitemList
                .stream()
                .filter(x -> x.getID().equals(WorkItemID))
                .findFirst();
        
        WorkItem wkItem = new WorkItem();
        wkItem.setID(dto.get().getID());
        wkItem.setItemTitle(dto.get().getItemTitle());

        switch (dto.get().getAssignType())
        {
            case ORGANIZATION:
                wkItem.setAssignee(factory.CreateOrganizationParticipant());
                wkItem.getAssignee().assignType = AssigneeType.ORGANIZATION;
                break;
            case ROLE:
                wkItem.setAssignee(factory.CreateRoleParticipant());
                wkItem.getAssignee().assignType = AssigneeType.ROLE;
                break;
            case HUMAN:
                wkItem.setAssignee(factory.CreateHumanParticipant());
                wkItem.getAssignee().assignType = AssigneeType.HUMAN;
                break;
        }
        wkItem.getAssignee().aggignee_name = dto.get().getAssigneeName();

        return wkItem.getAssignee().process();
    }
}