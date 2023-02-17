Feature: Home module

  @smoke @home
    Scenario: Verify welcome page
    Given User open application
    When user on welcome screen

    @android @home
      Scenario: Verify successful login
      Then  I login with "joe" and "ml@123"

      @ios @home
        Scenario Outline: Verify login
        Then I login with "<username>" and "<password>"
        Examples:
          | username | password |
          | joe      |  ml@123  |
          | siva     |  ml@123  |
          | siva     |  ml@123  |
          | vinay    |  ml@123  |

        @regression @home
          Scenario: Verify login failed
          Given I entered my credentials
          |joe|ml@123|921663131681|
          Then verify login failed
