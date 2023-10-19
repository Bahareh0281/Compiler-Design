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

        static void Main ()
        {
            string MathExpression = Console.ReadLine();
            if (IsValidMathExpression(MathExpression))
            {
                Console.WriteLine("Math expression is valid.");
            }
            else
            {
                Console.WriteLine("Math expression is not valid");
            }
        }
    }
}