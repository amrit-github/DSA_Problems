# Author: Bishal Sarang

# Import Visualiser class from module visualiser
from visualiser.visualiser import Visualiser as vs

# Add decorator
# Decorator accepts optional arguments: ignore_args , show_argument_name, show_return_value and node_properties_kwargs
# def fib(n):
#     if n <= 1:
#         return n
#     return fib(n=n - 1) + fib(n=n - 2)

@vs(node_properties_kwargs={"shape":"record", "color":"#f57542", "style":"filled", "fillcolor":"grey"})
def print_subsets(arr, ans, i):
    if i == len(arr):
        print(ans)
        return

    # include arr[i]
    ans.append(arr[i])
    print_subsets(arr, ans, i + 1)

    # exclude arr[i] (backtrack)
    ans.pop()
    print_subsets(arr, ans, i + 1)


def main():
    # Driver
    arr = [1, 2, 3]
    print_subsets(arr, [], 0)
    vs.make_animation("frame.gif", delay=20)

if __name__ == "__main__":
    main()