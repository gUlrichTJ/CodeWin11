import re

phone_num_rex = re.compile(r'\d\d\d-\d\d\d-\d\d\d\d')
mo = phone_num_rex.search("My phone number is 444-777-4898.")