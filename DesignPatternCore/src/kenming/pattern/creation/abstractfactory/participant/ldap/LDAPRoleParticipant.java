package kenming.pattern.creation.abstractfactory.participant.ldap;

import kenming.pattern.creation.abstractfactory.participant.*;

public class LDAPRoleParticipant extends RoleParticipant
{
    public String process()
    {
        String process_result = "製造工廠： LDAPFactory\n" +
                                "參與者類型： Role\n" +
                                "參與者： " + this.aggignee_name + "\n" +
                                "執行處理工作事務...。";

        return process_result;
    }
}
