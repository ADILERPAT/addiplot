package com.addiPlot;

public class eval {
	
	public static int STACK_DEPTH = 250;		/* maximum size of the execution stack */
	public static int MAX_AT_LEN = 150;		/* max number of entries in action table */

	/* Type definitions */

	/* HBB 20010725: Moved here, from parse.h */
	public enum operators {
	    /* keep this in line with table in eval.c */
	    PUSH, PUSHC, PUSHD1, PUSHD2, PUSHD, POP,
	    CALL, CALLN, LNOT, BNOT, UMINUS,
	    LOR, LAND, BOR, XOR, BAND, EQ, NE, GT, LT, GE, LE, PLUS, MINUS, MULT,
	    DIV, MOD, POWER, FACTORIAL, BOOLE,
	    DOLLARS, /* for using extension - div */
	    CONCATENATE, EQS, NES, RANGE,
	    ASSIGN,
	    /* only jump operators go between jump and sf_start, for is_jump() */
	    JUMP, JUMPZ, JUMPNZ, JTERN, SF_START
	};
	
	/* user-defined function table entry */
	public class udft_entry {
		//struct udft_entry *next_udf; /* pointer to next udf in linked list */
	    char udf_name;		 /* name of this function entry */
	    struct at_type at;		 /* pointer to action table to execute */
	    String definition;		 /* definition of function as typed */
	    int dummy_num;		 /* required number of input variables */
	    t_value dummy_values[MAX_NUM_VAR]; /* current value of dummy variables */
	};
	
	
	public class at_entry {
	    operators index;	/* index of p-code function */
	    argument arg;
	};
	
	public class at_type {
	    /* count of entries in .actions[] */
	    int a_count;
	    /* will usually be less than MAX_AT_LEN is malloc()'d copy */
	    at_entry actions[] = new at_entry[MAX_AT_LEN];
	};
	

	/* user-defined variable table entry */
	public class udvt_entry {
		//struct udvt_entry *next_udv; /* pointer to next value in linked list */
		String udv_name;		/* name of this value entry */
		boolean udv_undef;		/* true if not defined yet */
		t_value udv_value;		/* value it has */
	};
	
	/* p-code argument */
	// CCX typedef union argument {
	public class argument {
		int j_arg;		/* offset for jump */
		value v_arg;	/* constant value */
		udvt_entry udv_arg; /* pointer to dummy variable */
		udft_entry udf_arg; /* pointer to udf to execute */
	};
	
}