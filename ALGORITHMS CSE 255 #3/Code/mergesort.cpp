#include <bits/stdc++.h>
#define ss ' '
#define ll long long int
#define gcd(a, b) __gcd(a, b)
#define lcm(a, b) (a * b) / gcd(a, b)
#define fast()                    \
    ios_base::sync_with_stdio(0); \
    cin.tie(NULL);                \
    cout.tie(NULL)
#define max3(a, b, c) max(max(a, b), c)
#define min3(a, b, c) min(min(a, b), c)
#define pb push_back
#define all(v) v.begin(), v.end()
#define allr(v) v.rbegin(), v.rend()
#define endl '\n'
#define pi 3.14159265359
using namespace std;
const int N = 2e5 + 10;
vector<int> v(N);
void merge(int l, int r, int mid)
{
    int leftarsize, rightarsize, i;
    leftarsize = mid - l + 1;
    rightarsize = r - mid;
    int leftar[leftarsize + 1], rightar[rightarsize + 1];
    for (i = 0; i < leftarsize; i++)
    {
        leftar[i] = v[i + l];
    }
    for (i = 0; i < rightarsize; i++)
    {
        rightar[i] = v[mid + 1 + i];
    }
}
void mergesort(int l, int r)
{
    if (l == r)
        return;
    int mid = (l + r) / 2;
    mergesort(l, mid);
    mergesort(mid + 1, r);
    merge(l, r, mid);
}
int main()
{
    int i, l, r, j, n;
    cin >> n;
    for (i = 0; i < n; i++)
    {
        cin >> v[i];
    }
    mergesort(0, n - 1);
    return 0;
}