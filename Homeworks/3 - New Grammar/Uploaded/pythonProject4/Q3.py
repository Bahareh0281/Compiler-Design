def count_max_depth(code):
    max_depth = 0
    current_depth = 0

    for line in code:
        # current_depth = 0
        line = line.strip()

        if line.startswith("if") or line.startswith("while"):
            # print("Entered a if or while and current depth is: " , current_depth)
            current_depth += 1
            max_depth = max(max_depth, current_depth)

        # if line.endswith("{"):
        #     current_depth += 1

        if line.endswith("}"):
            # print("Exited a if or while and current depth is: " , current_depth)
            current_depth -= 1

    return max_depth

if __name__ == '__main__':

    # Read the input file
    input_file = "input3.txt"
    with open(input_file, "r") as file:
        content = file.readlines()

    max_depth = count_max_depth(content)
    print("Maximum Depth:", max_depth)
