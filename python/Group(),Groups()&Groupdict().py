import re
regex_string = re.search(r'([a-zA-Z0-9])', input().strip())
if regex_string:
    print(regex_string.group(1))
else: -1