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
        static void Main ()
        {
            string email = Console.ReadLine();
            if (IsEmailValid(email))
            {
                Console.WriteLine("Email is valid.");
            }
            else
            {
                Console.WriteLine("Email is not valid");
            }
        }
    }
}