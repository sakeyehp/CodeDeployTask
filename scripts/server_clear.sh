#!/usr/bin/env bash


if [ -f /home/ec2-user/server ]

then

rm -rf /home/ec2-user/server

else

echo "File does not exist, proceeding..."
