
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home
	 *	@date 		Wednesday 12th of April 2023 03:38:01 AM
	 *	@title 		v2
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.afinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class let_s_talk_activity extends Activity {

	
	private View _bg__let_s_talk_ek5;
	private View white_base_ek5;
	private ImageView vector_ek138;
	private TextView let_s_talk_is_a_confidential_consult_space_for_students_to_discuss_anything_they_are_struggling_with_in_a_given_moment_without_the_documentation_of_a_therapy_session__it_also_creates_an_opportunity_for_students_to_identify_if_they_would_be_interested_in_therapy__as_many_people_are_skeptical_due_to_the_stigma_surrounding_mental_health__let_s_talk_sessions_are_available_in_person_or_by_phone__walk_ins_are_welcome__however__appointments_are_highly_recommended__please_note_that_appointments_will_be_prioritized_before_walk_ins_;
	private TextView let_s_talk_ek6;
	private View view_schedule_rect_ek1;
	private TextView view_walk_in_schedule;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.let_s_talk);

		
		_bg__let_s_talk_ek5 = (View) findViewById(R.id._bg__let_s_talk_ek5);
		white_base_ek5 = (View) findViewById(R.id.white_base_ek5);
		vector_ek138 = (ImageView) findViewById(R.id.vector_ek138);
		let_s_talk_is_a_confidential_consult_space_for_students_to_discuss_anything_they_are_struggling_with_in_a_given_moment_without_the_documentation_of_a_therapy_session__it_also_creates_an_opportunity_for_students_to_identify_if_they_would_be_interested_in_therapy__as_many_people_are_skeptical_due_to_the_stigma_surrounding_mental_health__let_s_talk_sessions_are_available_in_person_or_by_phone__walk_ins_are_welcome__however__appointments_are_highly_recommended__please_note_that_appointments_will_be_prioritized_before_walk_ins_ = (TextView) findViewById(R.id.let_s_talk_is_a_confidential_consult_space_for_students_to_discuss_anything_they_are_struggling_with_in_a_given_moment_without_the_documentation_of_a_therapy_session__it_also_creates_an_opportunity_for_students_to_identify_if_they_would_be_interested_in_therapy__as_many_people_are_skeptical_due_to_the_stigma_surrounding_mental_health__let_s_talk_sessions_are_available_in_person_or_by_phone__walk_ins_are_welcome__however__appointments_are_highly_recommended__please_note_that_appointments_will_be_prioritized_before_walk_ins_);
		let_s_talk_ek6 = (TextView) findViewById(R.id.let_s_talk_ek6);
		view_schedule_rect_ek1 = (View) findViewById(R.id.view_schedule_rect_ek1);
		view_walk_in_schedule = (TextView) findViewById(R.id.view_walk_in_schedule);
	
		
		//custom code goes here

		vector_ek138.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), events_activity.class);
				startActivity(nextScreen);
			}
		});

		view_schedule_rect_ek1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), lt_times_activity.class);
				startActivity(nextScreen);
			}
		});
	
	}
}
	
	