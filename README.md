# Concreete-Jungle-App Deployment

- Database: I configured RDS Postgre Database to store Users and Tours data
- Deployment: Both backend and frontend application is deployed on Ec2 instance. We can use start-app.sh script to run the application.
- IP/ Domain: I have created an Elastic IP and attached it to our instance. This elastic ip is also configured to a free dns <strong>mahwish.me<strong>
- Unit Testing: We are using pytest to write unit test in python for our service layer.
- E2E Testing: We are using Cucumber and Selenium for writing E2E testing.
- Automation Testing: We have used Jenkins pipeline to automate our E2E testing

