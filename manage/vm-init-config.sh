#!/usr/bin/env bash

#create user
adduser user
#grant user sudo
sudo usermod -a -G sudo user

#install docker
wget -qO- https://get.docker.com/ | sh
#install docker-compose
sudo apt-get -y install python-pip
sudo pip install docker-compose

#install mc
sudo apt-get install mc

#add user to docker group
sudo useermod -aG docker user

#swith to user
su - user

#manage apt-get
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update

#install java
sudo apt-get install oracle-java8-installer

#install maven
sudo apt-get install maven

#install git
sudo apt-get install git
