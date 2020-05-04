#include<iostream>
using namespace std;
int main()
{
  int total_balls,total_runs,runs_scored,balls_bowled,a,b;
  cin>>total_balls>>total_runs>>runs_scored>>balls_bowled;
  float overs_finished,current_run_rate,total_run_rate;
  float total_overs=total_balls/6;
  a=(float)balls_bowled/6;
  b=balls_bowled%6;
  overs_finished=a+(float)b*0.1;
  current_run_rate=runs_scored/overs_finished;
  total_run_rate=total_runs/total_overs;
  cout<<total_overs<<"\n"<<overs_finished<<"\n";printf("%.1f\n%.1f\n",current_run_rate,total_run_rate);
  if(current_run_rate>=total_run_rate)
   cout<<"Eligible to Win";
   else
   cout<<"Not Eligible to Win";
   return 0;
}