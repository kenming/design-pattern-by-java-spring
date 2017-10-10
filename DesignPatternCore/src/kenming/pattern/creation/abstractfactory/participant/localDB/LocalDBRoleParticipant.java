package kenming.pattern.creation.abstractfactory.participant.localDB;

import kenming.pattern.creation.abstractfactory.participant.*;

public class LocalDBRoleParticipant extends RoleParticipant
{
    public String process()
    {
        String process_result = "製造工廠： LocalDBFactory\n" +
                                "參與者類型： Role\n" +
                                "參與者： " + this.aggignee_name + "\n" +
                                "執行處理工作事務...。";

        return process_result;
    }
}