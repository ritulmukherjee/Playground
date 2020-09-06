age=int(input())
time=float(input())
if((age>13) and (time==13.30)):
  print("$5.00")
elif((age>13) and (time>13.30)):
  print("$8.00")
elif((age>13) and (time<13.30)):
  print("$8.00")
  
if((age<=13) and (time==13.30)):
  print("$2.00")
elif((age<=13) and (time>13.30)):
  print("$4.00")
elif((age<=13) and (time<13.30)):
  print("$4.00")