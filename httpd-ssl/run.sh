#!/bin/bash
docker stop httpd-ssl
docker rm httpd-ssl
docker build -t httpd-ssl . 
docker run -dit --name httpd-ssl -p 443:443 httpd-ssl
