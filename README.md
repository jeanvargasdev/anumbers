Altice API Numbers

This api has only one endpoint

URL: https://app-alticci.herokuapp.com/swagger-ui/

GET /api/alticci/{n} Where:
Request: GET
{n} used to return the value calculated from the expression below:
n=0 => a(0) = 0
n=1 => a(1) = 1
n=2 => a(2) = 1
n>2 => a(n) = a(n-3) + a(n-2)

IMPORTANT
-> To simulate the use of caching, a time of 3 seconds was used in the FIRST call. Afterwards, if the same value is informed, it automatically returns what is in the cache.
-> The value added in n is wanted and, when it arrives at its position, it returns a single value calculated according to the expression previously placed.
