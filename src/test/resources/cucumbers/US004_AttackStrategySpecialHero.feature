Feature: SpecialHero attacks with different strategies
  As a Player,
  I want to be able attack with different strategies,
  So that my special hero has increased strength when attacking.

  Scenario Outline: attacking with a strategy
    Given there is a SpecialHero named <SpecialHeroName> with a strength of <InitialStrength>
    When the <SpecialHeroName> attacks with <AttackStrategy>
    Then the total attack power of <SpecialHeroName> should be <ExpectedAttackPower>

    Examples:
      | SpecialHeroName | InitialStrength | AttackStrategy | ExpectedAttackPower |
      | "Gandalf"       | 100             | "Pokemon"      | 120                |
      | "Aragorn"       | 120             | "Pistol"       | 120                 |
