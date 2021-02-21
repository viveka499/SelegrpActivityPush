Feature: End to end Functionality

@SmokeTest
Scenario: Registration button exists
Given I open guru99 website


When user enter valid data on the page
| Fields | Values |                             
| Title         | Miss |                  
| First Name    | Nithya |         
| Surname       | Shanthanu |
| Phone         | 9807896541 |
| Year_DOB      | 1994 |                  
| Month_DOB     | October |         
| Date_DOB      | 17 |
| License Period| 10 |                  
| Occupation    | Social worker |         
| Address       | Rangan Street |
| City          | Chennai |
| Country       | India |
| Postal code   | 600 006 |                  
| Email id      | nithya@gmail.com |         
| Password      | urspassword@123 |
| Confirm password| urspassword@123 |
Then the user registration should be successful



When User enters valid details 
| email | password |
| nithya@gmail.com | urspassword@123 |
Then Successful Login



When user enters valid data details on the page
| Fields   |  values    |
| Quantity     |  2         | 
| card_nmuber  |  7493037578241902 |
| month        |  02         |
| year         |  2022      |
| cvv_code     |  989       |
Then payment should be done
