package symboltable;

import ast.definitions.Definition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {

		private int scope=0;
		private List<Map<String, Definition>> table;

		public SymbolTable()  {
			this.table=new ArrayList<Map<String,Definition>>();
			table.add(new HashMap<String,Definition>());
		}

		public void set() {
			scope++;
			table.add(new HashMap<String,Definition>());
		}

		public void reset() {
			table.remove(scope);
			scope--;
		}

		public boolean insert(Definition d)
		{
			if(findInCurrentScope(d.getName())!=null)
			{
				return false;
			}
			else {

				table.get(scope).put(d.getName(), d);
				d.setScope(scope);
				return true;
			}

		}

		public Definition find(String id)
		{
			Definition def = null;
			for(int i=scope; i>=0; i--) {
				def=table.get(i).get(id);
				if(def!=null)
					break;
			}
			return def;
		}

		public Definition findInCurrentScope(String id) {

			return table.get(scope).get(id);
		}


}


