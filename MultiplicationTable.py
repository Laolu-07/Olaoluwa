'''for (int(first = 1, first <= 10, first++)){
   for (int second = 1, second <= 10, second ++){
print(first + " x " + second + " = " + (first*second) + " ");
}
print();
}    '''
for number in range (1, 10):
   for count in range (1, 10):
      
      print ( number * count, end= "  \t  ")
   print ("  ")

