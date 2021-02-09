// https://leetcode.com/problems/employee-importance/

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
         int sum = 0;
         HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
         for (Employee e : employees) {
             map.put(e.id, e);
         }

         Stack<Employee> stack = new Stack<Employee>();
         stack.push(map.get(id));
         while (!stack.isEmpty()) {
             Employee poped = stack.pop();
             sum += poped.importance;
             if (poped.subordinates != null && poped.subordinates.size() != 0) {
                 for (Integer i : poped.subordinates) {
                     stack.push(map.get(i));
                 }
             }
         }

        return sum;                
    }
}