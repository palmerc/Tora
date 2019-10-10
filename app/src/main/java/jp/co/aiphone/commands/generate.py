import csv

with open('commands.csv', 'r') as file:
    csv_reader = csv.reader(file, delimiter=',')
    line_count = 0
    for row in csv_reader:
        command = row[0].strip()
        direction = row[1].strip()
        type = row[2].strip()
        comment = row[3].strip()
        print("{} {} {} {}".format(command, direction, type, comment))

        java_filename = "{}.java".format(command)
        with open(java_filename, 'w') as java_file:
            code = '''\
package jp.co.aiphone.commands;

public class %s implements Command {

    @Override
    public String getCommand() {
        return "%s";
    }

    @Override
    public Direction getDirection() {
        return Direction.%s;
    }

    @Override
    public Type getType() {
        return Type.%s;
    }

    @Override
    public String getComment() {
        return "%s";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
''' % (command, command, direction, type, comment)
            java_file.write(code)

        line_count += 1
    print('Processed {line_count} lines.')
