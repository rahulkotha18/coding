/*Desc: Your task is to make function, which returns the sum of a sequence of integers.
If begin value is greater than the end, function should returns 0*/

int sequenceSum(int start, int end, int step) {
  int sum = 0;
  if (start > end)
    return 0;
  else
    for (start; start <=end; start += step)
      sum += start;
    return sum;
}