#!/bin/bash

# We go to our project directory
cd /home/gracianomathey/codes/CodeWin11

# We add everything
git add .

# We enter the commit message
commit_message="Auto commit at $(date + '%Y-%m-%d %H:%M:%S')"

git commit -am "$commit_message"

# We push to the remote repository
#git push
