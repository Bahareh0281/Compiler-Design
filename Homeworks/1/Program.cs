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

        static bool IsValidPostalCode (string PostalCode)
        {
            string PostalCodePattern = @"^\d{10}$";
            Regex regex = new Regex(PostalCodePattern);
            Match match = regex.Match(PostalCode);
            return match.Success;
        }

        static bool IsValidPhoneNumber (string PhoneNumber)
        {
            string PhoneNumberPattern = @"^09\d{9}$";
            Regex regex = new Regex(PhoneNumberPattern);
            Match match = regex.Match(PhoneNumber);
            return match.Success;
        }

        static void Main ()
        {
            string PhoneNumber = Console.ReadLine();
            if (IsValidPhoneNumber(PhoneNumber))
            {
                Console.WriteLine("Phone Number is valid.");
            }
            else
            {
                Console.WriteLine("Phone Number is not valid");
            }
        }
    }
}