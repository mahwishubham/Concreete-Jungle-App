#!/bin/bash

# Start Backend Application
cd /home/ubuntu/Concreete-Jungle-App/backend
source venv/bin/activate
python main.py &


# Start Frontend Application
cd /home/ubuntu/Concreete-Jungle-App/frontend
sudo http-server -a 0.0.0.0 -p 80 . &

