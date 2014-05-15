#!/usr/bin/python

import sys
import codecs

with codecs.open(sys.argv[1], 'r', 'cp1251') as file:
    for line in file:
        print line
