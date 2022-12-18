
@Form
 Feature: Fill the practice form

  @Form_01
  Scenario: Fill the form with valid data

 
  Given Navigate to the practice form
  When Enter the firstname "deepak" and lastname "patil"
  And Enter the emailid "deepaknpatil121@gmail.com"
  Then Verify the successfully filled
  Then Verify the successfully filled1