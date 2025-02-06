Feature: Digital Report Form

  @DigitalReport
  Scenario Outline:
    Given enter the higo website
    When user click DigitalReport
    And user fill the First Name with <firstName>
    Then user fill the Last Name with <lastName>
    And user fill the Email with <email>
    And user fill the Phone Number with <phoneNumber>
    Then user fill the Company Name with <companyName>
    And user fill the Job Title with <jobtitle>
    And user click Download Button
    And validasi action

    Examples:
      | firstName | lastName | email                  | phoneNumber         | companyName | jobtitle    |
      | Admin     | Testing  | clovertest12@gmail.com | 081289234556        | Testing     | QA Engineer |
      |           | Testing  | clovertest12@gmail.com | 081289234556        | Testing     | QA Engineer |
      | 12345     | Testing  | clovertest12@gmail.com | 081289234556        | Testing     | QA Engineer |
      | @#$%n     | Testing  | clovertest12@gmail.com | 081289234556        | Testing     | QA Engineer |
      | Admin     |          | clovertest12@gmail.com | 081289234556        | Testing     | QA Engineer |
      | Admin     | 12345    | clovertest12@gmail.com | 081289234556        | Testing     | QA Engineer |
      | Admin     | &^#$@r   | clovertest12@gmail.com | 081289234556        | Testing     | QA Engineer |
      | Admin     | Testing  |                        | 081289234556        | Testing     | QA Engineer |
      | Admin     | Testing  | c!^&*$@gmail.com       | 081289234556        | Testing     | QA Engineer |
      | Admin     | Testing  | clovertest12@yahoo.com | 081289234556        | Testing     | QA Engineer |
      | Admin     | Testing  | clovertest12@gmail.com |                     | Testing     | QA Engineer |
      | Admin     | Testing  | clovertest12@gmail.com | 0812892345567891011 | Testing     | QA Engineer |
      | Admin     | Testing  | clovertest12@gmail.com | 0812892345DUATIGA   | Testing     | QA Engineer |
      | Admin     | Testing  | clovertest12@gmail.com | 081289234$@*        | Testing     | QA Engineer |
      | Admin     | Testing  | clovertest12@gmail.com | 081289234556        |             | QA Engineer |
      | Admin     | Testing  | clovertest12@gmail.com | 081289234556        | 123456      | QA Engineer |
      | Admin     | Testing  | clovertest12@gmail.com | 081289234556        | @#$%^&      | QA Engineer |
      | Admin     | Testing  | clovertest12@gmail.com | 081289234556        | Testing     |             |
      | Admin     | Testing  | clovertest12@gmail.com | 081289234556        | Testing     | 1234567     |
      | Admin     | Testing  | clovertest12@gmail.com | 081289234556        | Testing     | @#$%^&*d    |
