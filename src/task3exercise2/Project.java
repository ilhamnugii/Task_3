package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154329
    // NAMA : ilham nugraha 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
    private String projectName;
    private int teamMember[];
    private int nTeam =0;
    private boolean releaseStatus =false;
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154329 
    // NAMA : ilham nugraha
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------

    public Project(String projectName) {
        this.projectName = projectName;
    }

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154329
    // NAMA : ilham nugraha 
    //
    //------------------- your code here-----------------------
        public String getProjectName() {
        return projectName;
    
    }    

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int[] getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(int[] teamMember) {
        this.teamMember = teamMember;
    }

    public int getnTeam() {
        return nTeam;
    }

    public void setnTeam(int nTeam) {
        this.nTeam = nTeam;
    }

    public boolean isReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(boolean releaseStatus) {    
        this.releaseStatus = releaseStatus;
    }

    //---------------------------------------------------------
    // 4. Declare method addMember( m : Member ) here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    //---------------------------------------------------------
    // 5. Declare method releaseApp() here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
    //---------------------------------------------------------
    // 6. Create method toString() : String here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // returns String that contains Project name, number of team member,
    // and release status
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
        //------------------- your code here-----------------------
        return null;
        
        //---------------------------------------------------------
    }
}