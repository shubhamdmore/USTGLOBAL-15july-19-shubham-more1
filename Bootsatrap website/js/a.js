var a  =[10,50,20,60,40,30];
var b = [];
document.write("origanal array");
document.write(a);
console.log(a);
for(i=0;i<a.length;i++)
{
    for(j=i+1;j<a.length;j++)
    {
        if(a[i]>a[j])
        {
            var temp = a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
document.write("sorting array");
for(j=0;j<a.length;j++)
{
    document.write(a[j]);
    document.write(",");
}

