using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CSsolutions
{
    public class TimeConversion
    {
         public static string timeConversion(string s)
    {
        DateTime convertedTime = DateTime.Parse(s);
        
        string newtime = convertedTime.ToString("HH:mm:ss");
        
        return newtime;

    }
    }
}