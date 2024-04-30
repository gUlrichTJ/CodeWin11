#!/bin/bash
#  The name of this file is auto_commit_push.sh

# This script is written to help to automate the pushes on github. Here, we use a ssh key...

# We shift
shift
# Let's take the commit message as an argument
commit_message = "Our commit message"

# We add all the files
git add .

# We commit the changes will the commit message
git commit -am "$commit_message"

# We push the changes to the remote repository
git push

