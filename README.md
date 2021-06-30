# CodeDeployTask

### You can install dependencies while deploying Amazon Linux instance  
Steps to install code deploy agent https://docs.aws.amazon.com/codedeploy/latest/userguide/codedeploy-agent-operations-install-linux.html  
sudo yum update  
sudo yum install -y ruby  
sudo yum install -y wget  
cd /home/ec2-user  
wget https://aws-codedeploy-us-east-2.s3.us-east-2.amazonaws.com/latest/install  
sudo chmod +x ./install  
sudo ./install auto  
sudo amazon-linux-extras install java-openjdk11  
sudo yum install -y git  
sudo yum install -y maven  

### You can install dependencies while deploying Ubuntu instance  
Steps to install code deploy agent https://docs.aws.amazon.com/codedeploy/latest/userguide/codedeploy-agent-operations-install-ubuntu.html  
sudo apt update  
sudo apt install -y ruby-full  
sudo apt install -y wget  
cd /home/ubuntu  
wget https://aws-codedeploy-us-east-2.s3.us-east-2.amazonaws.com/latest/install  
sudo chmod +x ./install  
sudo ./install auto  
sudo apt install -y default-jdk  
sudo apt install -y git  
sudo apt-get -y install maven  



### Build Tool: 
1. buildspec.yml

### Continuous Delivery Tool:
1. appsec.yml
2. scripts
