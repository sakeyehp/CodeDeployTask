#!/usr/bin/env bash
cd /home/ec2-user/server
sudo nohup java -jar -Dserver.port=80 \
    *.jar &
