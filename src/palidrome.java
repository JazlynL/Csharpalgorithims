public bool IsPalindrome(int x) {
        String first = x.ToString();
        String second = x.ToString();
        String reverse = "";




        for(int i = second.Length-1; i >= 0 ; i--){
        reverse += second[i];
        }
        Console.WriteLine(first);
        Console.WriteLine(reverse);


        if(first.Equals(reverse) || x == 0){
        return true;
        }else{
        return false;
        }


        return false;
        }
        }