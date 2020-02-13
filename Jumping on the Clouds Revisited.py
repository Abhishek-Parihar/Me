n,o= [int(i) for i in input().split(' ')]
ls = [str(i) for i in range(n)]
j = -1
for i in input().split(' '):
    j = j+1
    i = int(i)
    if i == 0:
        ls[j] = ls[j] + 'Safe'
    else :
        ls[j] = ls[j] + 'Red'
e = 100
c = -1
k = 0
while c==-1 or k!=0:
    c = c + 1
    k = k + o
    if k>n-1:
        k=k-n
    e = e - 1
    if ls[k].endswith('Red'):
        e = e - 2
print(e)