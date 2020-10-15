#!/bin/python3

import math
import os
import random
import re
import sys
from datetime import datetime, timedelta

# Complete the dayOfProgrammer function below.
def dayOfProgrammer(year):
    dt = datetime.strptime(str(year), "%Y")
    dt += timedelta(days=255)
    return dt.strftime("%d.%m.%Y")


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    year = int(input().strip())

    result = dayOfProgrammer(year)

    fptr.write(result + '\n')

    fptr.close()
