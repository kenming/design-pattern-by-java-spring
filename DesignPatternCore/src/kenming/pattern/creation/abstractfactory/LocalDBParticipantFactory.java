package kenming.pattern.creation.abstractfactory;

import kenming.pattern.creation.abstractfactory.participant.*;
import kenming.pattern.creation.abstractfactory.participant.localDB.*;

/// <summary>
/// The 'Concrete Factory' class.
/// </summary>
public class LocalDBParticipantFactory extends ParticipantFactory
{
  public OrganizationParticipant CreateOrganizationParticipant()
  {
      OrganizationParticipant op = new LocalDBOrganizationParticipant();
      return op;
  }

  public RoleParticipant CreateRoleParticipant()
  {
      RoleParticipant rp = new LocalDBRoleParticipant();
      return rp;
  }

  public HumanParticipant CreateHumanParticipant()
  {
      HumanParticipant hp = new LocalDBHumanParticipant();
      return hp;
  }
}