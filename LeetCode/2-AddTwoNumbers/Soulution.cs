using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SharpFont;


namespace GIT
{
    public class Solution
    {
        public ListNode AddTwoNumbers(ListNode l1, ListNode l2)
        {

            int result = Convert.ToInt32(l1.Data) + Convert.ToInt32(l2.Data);
            IntPtr ip = new IntPtr(result);
            ListNode ln = new ListNode(ip);

            return ln;
        }
    }
}
