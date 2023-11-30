if __name__ == '__main__':

    # Read the input file
    input_file = "input.txt"
    with open(input_file, "r") as file:
        content = file.readlines()

    last_name = "Kavousi"
    StudentID = "99431217"
    # Modify the comments and create the updated content
    updated_content = []
    for line in content:
        if line.startswith("#"):
            updated_line = "# " + last_name + " " + line.lstrip("#").rstrip("\n") + " " + StudentID + "\n"
            updated_content.append(updated_line)
        else:
            updated_content.append(line)

    # Write the updated content to a new file
    output_file = "output.txt"
    with open(output_file, "w") as file:
        file.writelines(updated_content)
