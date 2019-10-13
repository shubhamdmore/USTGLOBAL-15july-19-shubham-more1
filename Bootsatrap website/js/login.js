function validate()
{
    var v1 = document.getElementById("username").value;
    var v2 =document.getElementById("password");
    
    if((v1==null || v1=="")&&(v2==null || v2==""))
    {
        alert("plase enter username and password");
    }
    else if(v1==null || v1=="")
    {
        alert("plase enter username");
    }
    else if(v2==null || v2=="")
    {
        alert("plase enter password");
    }
}