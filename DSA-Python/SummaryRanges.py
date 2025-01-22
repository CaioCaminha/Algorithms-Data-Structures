from typing import List


def summaryRanges(nums: List[int]) -> List[str]:
    if len(nums) == 0 or len(nums) == 1:
        return list(map(lambda x: "{}".format(x), nums))

    ranges = [(-99, -99)]

    for num in nums:
        lastRange = ranges[len(ranges) - 1]
        if num == (lastRange[1] + 1):
            ranges[len(ranges) - 1] = (lastRange[0], num)
        else:
            ranges.append((num, num))

    if len(ranges) > 1:
        ranges.pop(0)
    return list(
        map(
            lambda x: "{}".format(x[0])
            if x[0] == x[1]
            else "{}->{}".format(x[0], x[1]),
            ranges,
        )
    )


print(summaryRanges([1, 2]))