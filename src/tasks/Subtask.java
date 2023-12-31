package tasks;

import tasks.Task;

public class Subtask extends Task {
    private int epicId;

    public Subtask(String name, String description, int epicId) {
        super(name, description);
        this.epicId = epicId;
    }

    public Subtask(Integer id, String name, Status status, String description,String time, int duration, int epicId) {
        super(id, name, status, description, time, duration);
        this.epicId = epicId;
    }

    public Subtask(String name, String description, String time, int duration, int epicId) {
        super(name, description, time, duration);
        this.epicId = epicId;
    }


    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "epicId=" + epicId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", startTime=" + startTime +
                ", duration=" + duration +
                '}';
    }

   /* @Override
    public String toString() {
        return "tasks.Subtask{" +
                "epicId=" + getEpicId() +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}' + "\n";
    }*/
}
