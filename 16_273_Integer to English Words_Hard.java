
class Solution
{
    String[] ones = {
        "", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public String numberToWords(int num)
    {
        if(num == 0)
        {
            return "Zero";
        }

        return convert(num);
    }

    public String convert(int num)
    {
        String result = "";

        if(num < 20)
        {
            result = ones[num];
        }
        else if(num < 100)
        {
            result = tens[num / 10];

            if(num % 10 != 0)
            {
                result = result + " " + ones[num % 10];
            }
        }
        else if(num < 1000)
        {
            result = ones[num / 100] + " Hundred";

            if(num % 100 != 0)
            {
                result = result + " " + convert(num % 100);
            }
        }
        else if(num < 1000000)
        {
            result = convert(num / 1000) + " Thousand";

            if(num % 1000 != 0)
            {
                result = result + " " + convert(num % 1000);
            }
        }
        else if(num < 1000000000)
        {
            result = convert(num / 1000000) + " Million";

            if(num % 1000000 != 0)
            {
                result = result + " " + convert(num % 1000000);
            }
        }
        else
        {
            result = convert(num / 1000000000) + " Billion";

            if(num % 1000000000 != 0)
            {
                result = result + " " + convert(num % 1000000000);
            }
        }

        return result;
    }
}
