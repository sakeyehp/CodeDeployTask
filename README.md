# CodeDeployTask

### Dependencies
sudo apt update
sudo apt install -y ruby-full
sudo apt install -y wget
cd /home/ubuntu
wget https://aws-codedeploy-us-east-2.s3.us-east-2.amazonaws.com/latest/install
sudo chmod +x ./install
sudo ./install auto
sudo apt install -y default-jdk
sudo apt install -y postgresql postgresql-contrib
sudo apt install -y git
sudo apt-get -y install maven


### Build Tool: 
1. buildspec.yml

### Continuous Delivery Tool:
1. appsec.yml
2. scripts
