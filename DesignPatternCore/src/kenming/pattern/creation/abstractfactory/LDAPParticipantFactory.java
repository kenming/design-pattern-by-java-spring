package kenming.pattern.creation.abstractfactory;

import kenming.pattern.creation.abstractfactory.participant.*;
import kenming.pattern.creation.abstractfactory.participant.ldap.*;

/// <summary>
/// The 'Concrete Factory' class.
/// </summary>
public class LDAPParticipantFactory extends ParticipantFactory
{
  public OrganizationParticipant CreateOrganizationParticipant()
  {
      OrganizationParticipant op = new LDAPOrganizationParticipant();
      return op;
  }

  public RoleParticipant CreateRoleParticipant()
  {
      RoleParticipant rp = new LDAPRoleParticipant();
      return rp;
  }

  public HumanParticipant CreateHumanParticipant()
  {
      HumanParticipant hp = new LDAPHumanParticipant();
      return hp;
  }
}