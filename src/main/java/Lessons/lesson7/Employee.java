package Lessons.lesson7;

import java.util.Arrays;

public class Employee extends Man {
    private String position;
    private IdCard card;
    private Room[] rooms;
    private Department department;
    private PastPosition[] pastPositions;

    public Employee(String name, String surname, String position) {
        super(name, surname);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
        if (pastPositions == null) {
            pastPositions = new PastPosition[10];
        }
        boolean isPositionAdded = false;
        for (PastPosition value : pastPositions) {
            if (value.getName().equals(position)) {
                return;
            }
        }
        for (int i = 0; i < pastPositions.length; i++) {
            if (pastPositions[i] == null) {
                pastPositions[i].setName(this.getPosition());
                pastPositions[i].setDepartment(this.getDepartment());
                isPositionAdded = true;
                break;
            }
        }
        if (!isPositionAdded) {
            pastPositions = Arrays.copyOf(pastPositions, pastPositions.length + (pastPositions.length >> 1));
        }
    }

    public IdCard getCard() {
        if (card == null)
            return null;
        return card;
    }

    public void setCard(IdCard card) {
        this.card = card;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRoom(Room room) {
        if (rooms == null) {
            rooms = new Room[10];
        }
        boolean isRoomAdded = false;
        for (Room value : rooms) {
            if (value != null) {
                if (value.equals(room)) {
                    return;
                }
            }
        }

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = room;
                isRoomAdded = true;
                break;
            }
        }

        if (!isRoomAdded) {
            rooms = Arrays.copyOf(rooms, rooms.length + (rooms.length >> 1));
        }
    }

    public void deleteRoom(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                rooms[i] = null;
            }
        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
        department.addEmployee(this);
    }

    public PastPosition[] getPastPositions() {
        return pastPositions;
    }

    public void setPastPositions(PastPosition object) {
        if (pastPositions == null) {
            pastPositions = new PastPosition[10];
        }
        boolean isPositionAdded = false;
        for (PastPosition value : pastPositions) {
            if (value != null) {
                if (value.equals(object)) {
                    return;
                }
            }
        }
        for (int i = 0; i < pastPositions.length; i++) {
            if (pastPositions[i] == null) {
                pastPositions[i] = object;
                isPositionAdded = true;
                break;
            }
        }
        if (!isPositionAdded) {
            pastPositions = Arrays.copyOf(pastPositions, pastPositions.length + (pastPositions.length >> 1));
        }
    }

    public void deletePastPosition(PastPosition position) {
        if (pastPositions == null) {
            return;
        }
        for (int i = 0; i < pastPositions.length; i++) {
            if (pastPositions[i].equals(position)) {
                pastPositions[i] = null;
                break;
            }
        }
    }
}
