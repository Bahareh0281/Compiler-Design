using System;
using System.Text.RegularExpressions;

namespace Compiler
{
    class HW1 
    {
        static bool IsEmailValid (string EmailAddress)
        {
            string EmailPattern = @"^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$";
            Regex regex = new Regex(EmailPattern);
            Match match = regex.Match(EmailAddress);
            return match.Success;
        }

        static bool IsValidMathExpression (string MathExpression)
        {
            string MathExpressionPattern = @"^\d+(\s*[-+*/]\s*\d+)*$";
            Regex regex = new Regex(MathExpressionPattern);
            Match match = regex.Match(MathExpression);
            return match.Success;
        }

        static bool IsValidURL (string URL)
        {
            string URLPattern = @"^(https?|ftp)://[^\s/$.?#].[^\s]*$";
            Regex regex = new Regex(URLPattern);
            Match match = regex.Match(URL);
            return match.Success;
        }

        static void Main ()
        {
            string URL = Console.ReadLine();
            if (IsValidURL(URL))
            {
                Console.WriteLine("URL is valid.");
            }
            else
            {
                Console.WriteLine("URL is not valid");
            }
        }
    }
}