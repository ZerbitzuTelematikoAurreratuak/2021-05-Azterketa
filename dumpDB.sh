#!/bin/bash

DBUSER=student
DBPASS=sql
DB=Exam

mysqldump -u$DBUSER -p$DBPASS --no-tablespaces --add-drop-database --databases $DB > dump.sql
