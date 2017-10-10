package kenming.pattern.creation.abstractfactory;

import kenming.pattern.creation.abstractfactory.participant.*;

/// <summary>
/// The 'Abstract Factory' class
/// 參與者抽象工廠
/// </summary>
public abstract class ParticipantFactory
{
  public abstract OrganizationParticipant CreateOrganizationParticipant();
  public abstract RoleParticipant CreateRoleParticipant();
  public abstract HumanParticipant CreateHumanParticipant();
}
